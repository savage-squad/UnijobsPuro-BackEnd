package br.uniamerica.unijobs.model;

public class Usuario extends Pessoa {
    private Integer id;
    private String email;
    private String senha;
    private TipoUsuario tipoUsuario;

    public Usuario() {

    }

    public Usuario(String nome, String celular, String ra, Universidade universidade, Curso curso, Integer id, String email, String senha, TipoUsuario tipoUsuario) {
        super(nome, celular, ra, universidade, curso);
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.tipoUsuario = tipoUsuario;
    }

    public Usuario(int id, String email, String nome, String celular, String ra) {
        super(nome, celular, ra, null, null);
        this.email = email;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", tipoUsuario=" + tipoUsuario +
                '}';
    }
}
//	public void create() throws SQLException, Exception{
//		connection.AbreConexao();
//		String sql = "INSERT INTO users (email,senha, nome, celular, ra) VALUES (?,?,?,?,?) ";
//
//		PreparedStatement statement = connection.getConexao().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//
//		statement.setString(1, this.email);
//		statement.setString(2, this.senha);
//		statement.setString(3, this.nome);
//		statement.setString(4, this.getCelular());
//		//"INSERT INTO users (email,senha, cpf) VALUES ("@email","123","100.145.956-50")
//
//		int affectedRows = statement.executeUpdate();
//
//		if ( affectedRows == 0 ){
//			throw new Exception("Não foi poossivel criar a tarefa");
//		}
//		ResultSet generatedKeys = statement.getGeneratedKeys();
//		if(generatedKeys.next()){
//			this.codigo = generatedKeys.getInt(1);
//		}
//
//		connection.FechaConexao();
//		System.out.println("O seu cadastro foi realizado com sucesso");
//	}
//	public void read(int codigo) throws SQLException, Exception{
//		connection.AbreConexao();
//		String sql = "SELECT * FROM users WHERE codigo = ?";
//		PreparedStatement statement = connection.getConexao().prepareStatement(sql);
//		statement.setInt(1, codigo);
//
//		ResultSet resultado = statement.executeQuery();
//		if(resultado.next()){
//			this.codigo = resultado.getInt("codigo");
//			this.email = resultado.getString("email");
//			this.senha = resultado.getString("senha");
//			this.cpf = resultado.getString("cpf");
//		} else {
//			throw new Exception("usuario não encontrado");
//		}
//
//		connection.FechaConexao();
//
//	}
//	public ArrayList<Usuario> All() throws SQLException{
//		connection.AbreConexao();
//		ArrayList<Usuario> usuarios = new ArrayList<>();
//		String sql = "SELECT * FROM users";
//		PreparedStatement statement = connection.getConexao().prepareStatement(sql);
//
//		ResultSet resultado = statement.executeQuery();
//		while(resultado.next()){
//			Usuario usuario = new Usuario();
//			usuario.setCodigo( resultado.getInt("codigo") );
//			usuario.setEmail( resultado.getString("email") );
//			usuario.setSenha( resultado.getString("senha") );
//			usuario.setCpf( resultado.getString("cpf") );
//			usuarios.add(usuario);
//		}
//		connection.FechaConexao();
//		return usuarios;
//	}
//	public void update() throws SQLException{
//		connection.AbreConexao();
//		String sql = "UPDATE users SET email = ?, senha = ?, cpf = ? where codigo = ?";
//		PreparedStatement statement = connection.getConexao().prepareStatement(sql);
//		statement.setString(1, this.email);
//		statement.setString(2, this.senha);
//		statement.setString(3, this.cpf);
//		statement.setInt(4, this.codigo);
//
//
//		statement.executeUpdate();
//
//		connection.FechaConexao();
//	}
//
//	public void delete() throws SQLException {
//		connection.AbreConexao();
//		String sql = "DELETE FROM users WHERE codigo = ?";
//		PreparedStatement statement = connection.getConexao().prepareStatement(sql);
//		statement.setInt(1, this.codigo);
//
//		statement.executeUpdate();
//
//		connection.FechaConexao();
//	}
//
//}
