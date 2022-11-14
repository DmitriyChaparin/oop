public class Main {
    public static void main(String[] args) {
        Man maksim = new Man("   ", "Минск", -1998," ");
        Man anna = new Man("Аня","Москва",1993,"методист образовательных программ");
        Man katia = new Man("Катя", "Калининград", 1992,"продакт-менеджер");
        Man artem = new Man("Артём", "Москва", 1995,"директор по развитию бизнеса");
        maksim.printInfo();
        katia.printInfo();
        artem.printInfo();
        anna.printInfo();

    }
}