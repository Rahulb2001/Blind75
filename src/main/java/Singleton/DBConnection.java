package Singleton;

public class DBConnection {

    private static volatile DBConnection instance=null;

    private DBConnection(){
        System.out.println("DB Connection Created");
    }

    public static DBConnection getInstance(){

        if(instance==null){

            synchronized (DBConnection.class){
                if(instance==null){
                    instance=new DBConnection();
                }
            }
        }

        return instance;
    }
}
