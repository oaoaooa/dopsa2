package ru.ifmo.se.lab3.objects;
import ru.ifmo.se.lab3.enums.Place;

public class Flowers{
    private String growPlace;

    public static class Stem{
        public static String string(){
            return " стебель";
        }
    } //static nested class

    public void grow(Place p){
        switch (p){
            case CITY -> this.growPlace = " В городе росли";
            default -> this.growPlace = "";
        }
    }

    public String getGrowPlace(){
        return this.growPlace;
    }

    @Override
    public int hashCode(){
        return this.growPlace.hashCode();
    }

    @Override
    public boolean equals(Object o){
        if (this.getClass() != o.getClass() || o == null){
            return false;
        }

        Flowers f = (Flowers) o;

        return f.growPlace == this.growPlace;
    }

    @Override
    public String toString(){
        return " цветы";
    }

    public String lookALike(){
        return toString() + " похожие на фикусы";
    }

    public String makeACut(){
        return " сделать надрез" + Stem.string();
    }
}