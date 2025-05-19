public class Usuario {
    private String auth0id;
    private String username;

    public Usuario(String auth0id, String username) {
        this.auth0id = auth0id;
        this.username = username;
    }

    public String getAuth0id() {
        return auth0id;
    }

    public void setAuth0id(String auth0id) {
        this.auth0id = auth0id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "auth0id='" + auth0id + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
