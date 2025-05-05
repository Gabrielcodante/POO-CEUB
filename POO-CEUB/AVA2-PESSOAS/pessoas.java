public class Cliente {
    
    private String cpf;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;

    
    public Cliente(String cpf, String nome, String endereco, String telefone, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Fornecedor(int id, String nome, String endereco, String telefone, String produto) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.produto = produto;
    }
    
    // Getters e setters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getProduto() {
        return produto;
    }
    
    public void setProduto(String produto) {
        this.produto = produto;
    }

    public class Empregado {
        
        private int id;
        private String nome;
        private String cargo;
        private String datacontratacao;
        private double salario;
    
    }
        public Empregado(int id, String nome, String cargo, String datacontratacao, double salario) {
            this.id = id;
            this.nome = nome;
            this.cargo = cargo;
            this.datacontratacao = datacontratacao;
            this.salario = salario;
        }
    
        
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
    
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public String getCargo() {
            return cargo;
        }
    
        public void setCargo(String cargo) {
            this.cargo = cargo;
        }
    
        public String getDatacontratacao() {
            return datacontratacao;
        }
    
        public void setDatacontratacao(String datacontratacao) {
            this.datacontratacao = datacontratacao;
        }
    
        public double getSalario() {
            return salario;
        }
    
        public void setSalario(double salario) {
            this.salario = salario;
        }

        public class Vendedor {
           
            private int id;
            private String regiaodeatuacao;
            private String telefone;
            private String email;
        
        }
            public Vendedor(int id, String regiaodeatuacao, String telefone, String email) {
                this.id = id;
                this.regiaodeatuacao = regiaodeatuacao;
                this.telefone = telefone;
                this.email = email;
            }
        
           
            public int getId() {
                return id;
            }
        
            public void setId(int id) {
                this.id = id;
            }
        
            public String getRegiaodeatuacao() {
                return regiaodeatuacao;
            }
        
            public void setRegiaodeatuacao(String regiaodeatuacao) {
                this.regiaodeatuacao = regiaodeatuacao;
            }
        
            public String getTelefone() {
                return telefone;
            }
        
            public void setTelefone(String telefone) {
                this.telefone = telefone;
            }
        
            public String getEmail() {
                return email;
            }
        
            public void setEmail(String email) {
                this.email = email;
            }

            public class Usuario {
                
                private int id;
                private String nome;
                private String senha;
                private String perfil;
                private String dataultimologin;
            
            }
                public Usuario(int id, String nome, String senha, String perfil, String dataultimologin) {
                    this.id = id;
                    this.nome = nome;
                    this.senha = senha;
                    this.perfil = perfil;
                    this.dataultimologin = dataultimologin;
                }
            
                
                public int getId() {
                    return id;
                }
            
                public void setId(int id) {
                    this.id = id;
                }
            
                public String getNome() {
                    return nome;
                }
            
                public void setNome(String nome) {
                    this.nome = nome;
                }
            
                public String getSenha() {
                    return senha;
                }
            
                public void setSenha(String senha) {
                    this.senha = senha;
                }
            
                public String getPerfil() {
                    return perfil;
                }
            
                public void setPerfil(String perfil) {
                    this.perfil = perfil;
                }
    
}