package ru.mirea.task22;

enum ChairType{
    VICTORIAN,
    MULTIFUNC,
    MAGIC
}

public class ChairFactory {


    public Chair createChair(ChairType type){
        Chair chair = null;

        switch (type){
            case VICTORIAN:
                chair = new VictorianChair();
                break;
            case MULTIFUNC:
                chair = new MultifuncChair();
                break;
            case MAGIC:
                chair = new MagicChair();
                break;
        }
        return chair;
    }
}
