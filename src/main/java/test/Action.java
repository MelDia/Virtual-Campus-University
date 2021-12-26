package test;

import datos.UsuarioJDBC;
import domain.Usuario;
import java.sql.SQLException;
import java.util.List;

public class Action {

    private UsuarioJDBC usuarioJdbc = new UsuarioJDBC();

    public void Select() throws SQLException {

        List<Usuario> usuarios = usuarioJdbc.select();
        for (Usuario usuario : usuarios) {
            System.out.println("usuario: " + usuario);
        }

    }

    public void Insert(String username, String password) throws SQLException {
        Usuario usuarioNew = new Usuario(username, password);
        usuarioJdbc.insert(usuarioNew);
        System.out.println("A new user has been added");
    }

    public void Update(int idusuario, String username, String password) throws SQLException {
        Usuario usuarioChange = new Usuario(idusuario, username, password);
        usuarioJdbc.update(usuarioChange);
        System.out.println("A user has been updated");
    }

    public void Delete(int idusuario) throws SQLException {
        Usuario usuarioRemoved = new Usuario(idusuario);
        usuarioJdbc.delete(usuarioRemoved);
        System.out.println("A user has been deleted");

    }
}
