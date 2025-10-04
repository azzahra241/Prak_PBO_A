public class App {
    public static void main(String[] args) throws Exception {
        Iphone iGold = new Iphone();
        Iphone iGreen = new Iphone();
        Iphone iGrey = new Iphone();
        Iphone iDarkGrey = new Iphone();

        iGold.Color = "Gold";
        iGreen.Color = "Green";
        iGrey.Color  = "Grey";
        iDarkGrey.Color = "DarkGrey";

        iGold.Storage = "64GB";
        iGreen.Storage = "128GB";
        iGrey.Storage = "512GB";
        iDarkGrey.Storage = "64GB";

        iGold.nyala(); 
        iDarkGrey.berdering();
    }
}
