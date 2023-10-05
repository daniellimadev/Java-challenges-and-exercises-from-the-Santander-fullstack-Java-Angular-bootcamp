package challenges.devicePhone;

import challenges.devicePhone.entities.DevicePhone;
import challenges.devicePhone.entities.InternetBrowser;

import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DevicePhone phone = new DevicePhone();
        InternetBrowser browser = new InternetBrowser();

        /*********************** Browser  ***********************/

        System.out.print("Digite a pagina que deseja encontrar: ");
        String url = sc.next();
        browser.addNewPage(url);
        browser.displayPage();

        /*********************** phone  ***********************/

        System.out.println("*************************************************************");
        System.out.println("Digite o numero para quem deseja ligar: ");
        Integer number = sc.nextInt();
        phone.call(number);

        System.out.println("Deseja atender a ligação(sim/nao)? ");
        String status = sc.next().toLowerCase();
        phone.answer(status);
    }
}
