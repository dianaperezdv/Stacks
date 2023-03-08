import java.util.Stack;

public class Chat {
    protected Stack<String>nombreUsuarios;

    protected boolean administrador=true;

    public Chat() {
        this.nombreUsuarios = new Stack<>();

    }

    //Agregando el usuario cuando se conecta al chat.
    public void usuarioConectado(String usuario){
        this.nombreUsuarios.push(usuario);
    }

    //Eliminando usuario desconectado
    public void usuarioDesconectado(){
        if(!nombreUsuarios.empty()){
            this.nombreUsuarios.pop();
        }else{
            System.out.println("No hay usuarios en linea en este momento..");
        }
    }

    // Funcionalidad administrador

//   public void crearUsuarios(){
//        if(administrador){
//            System.out.println("Inserta uno a uno los nombres que deseas crear");
//        }else{
//            System.out.println("Usted no es admin, no puede crear usuarios.");
//        }
//   }




}
