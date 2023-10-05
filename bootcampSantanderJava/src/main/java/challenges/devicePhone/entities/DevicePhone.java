package challenges.devicePhone.entities;

public class DevicePhone {
    private String callingStatus;

    public DevicePhone() {}

    public void call(Integer number){
        System.out.println("Ligando para " + number);
    }


    public void answer(String status){
        if(status.equals("sim")){
            System.out.println("Ligação atendida");
        }else if(status.equals("nao")){
            System.out.println("Ligação recusada");
        }else{
            System.out.println("Continua tocando...");
        }
    }
    public void startVoiceMail(){
        System.out.println("Iniciando gravação para correio de voz");
    }
}
