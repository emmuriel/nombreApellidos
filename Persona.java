public class Persona {

    private String nombre;
    private String apellidos;
    private int edad;


    //Constructores
    public Persona(){}
    public Persona(String n, String a, int e){
        this.nombre=n;
        this.apellidos=a;
        this.edad=e;
    }
    //Métodos de la clase




    //getters
    public int getEdad()
    {
        return this.edad;
    }
    public String getNombre()
    {
        return this.nombre;
    }  
    public String getApellidos()
    {
        return this.apellidos;
    }  

        //set
        public void setEdad(int e)
        {
             this.edad=e;
        }
        public void setNombre(String n)
        {
            this.nombre=e;
        }  
        public String getApellidos()
        {
            return this.apellidos;
        }  

    
}
