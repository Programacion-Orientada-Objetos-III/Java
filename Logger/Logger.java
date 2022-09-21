package Logger;

public class Logger {
    private Level level = Level.DEBUG;

    public void setLevel(Level level) {
        this.level = level;
    }

    public Logger getLogger(){
        return this;
    }
    public void error(String message){
        if(Level.ERROR.compareTo(level)> 0){
            System.out.println("[ERROR] " + message);
        }
    }
    public void debug(String message){
        if(Level.DEBUG.compareTo(level)> 0){
            System.out.println("[DEBUG] " + message);
        }
    }
    public void info(String message){
        if(Level.INFO.compareTo(level)> 0){
            System.out.println("[INFO] " + message);
        }
    }
    public void warn(String message){
        if(Level.WARN.compareTo(level)> 0){
            System.out.println("[WARNING] " + message);
        }
    }
}
