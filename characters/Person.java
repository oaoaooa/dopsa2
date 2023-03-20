package ru.ifmo.se.lab3.characters;
import ru.ifmo.se.lab3.objects.Carriable;

public class Person{ 
    public String carry(Carriable с){
        return toString() + " приносить" + с.toString();
    }

    @Override
    public String toString(){
        return " все";
    }

    @Override
    public int hashCode(){
        String stringToHash = this.getClass().getSimpleName();
        return stringToHash.hashCode();
    }

    @Override
    public boolean equals(Object o){
        if (this.getClass() != o.getClass() || o == null){
            return false;
        }
        return true;
    }

    public String likeTheIdea(){
        class Idea{
            @Override
            public String toString(){
                return " Затея";
            }   
        }; // local class

        Idea idea = new Idea();

        return idea.toString() + " понравилось" + toString();
    }
}