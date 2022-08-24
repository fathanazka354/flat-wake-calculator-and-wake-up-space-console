package core;

import core.lifecycle.Lifecycle;

import java.util.Scanner;

public abstract class BaseApp implements Lifecycle {
    private final Scanner scanner;
    private Boolean isPlayed;
    abstract protected void create(Scanner scanner);
    protected BaseApp(){
        isPlayed = true;
        scanner = new Scanner(System.in);
    }

    @Override
    public void onStart() {
        while (isPlayed){
            create(scanner);
        }
    }

    @Override
    public void onDestroy() {
        scanner.close();
        System.exit(1);
    }

    @Override
    public void onStop() {
        isPlayed = false;
    }
}
