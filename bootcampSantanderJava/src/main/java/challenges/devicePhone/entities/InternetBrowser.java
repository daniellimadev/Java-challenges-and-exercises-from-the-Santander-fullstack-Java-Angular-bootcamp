package challenges.devicePhone.entities;

public class InternetBrowser {
    private String currentPage;

    public InternetBrowser() {
    }

    public void displayPage(){
        if(currentPage != null){
            System.out.println("Exibindo pagina atual: " + currentPage);
        }else {
            System.out.println("Selecione uma pagina");
        }
    }

    public void addNewPage(String url){
        if(url != null ){
            this.currentPage = url;
            System.out.println("Página carregada: " + currentPage);
        } else {
            System.out.println("URL inválida. Nenhuma página carregada..");
        }
    }
}
