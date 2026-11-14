package plaindoll;

public class Welcomer {
    public String sayWelcome() {
        return "Welcome home, good hunter. What is it you desire?";
    }
    public String sayFarewell() {
        return "Farewell, good hunter. May you find your worth in the waking world.";
    }
    public String sayNeedGold(){
        return "Not enough gold";
    }
    public String saySome(){
        return "something in the way";
    }
    
    // Ваш новый метод:
    public String sayHunter() {
        return "I am a skilled hunter from Yharnam";
    }
}