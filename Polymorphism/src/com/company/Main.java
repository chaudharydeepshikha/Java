package com.company;

class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No Plot here";
    }

    public String getName() {
        return name;
    }
}

class IronMan extends Movie{
    public IronMan() {
        super("Iron Man");
    }

    public String plot(){
        return "Constructs a high-tech armoured suit to save the world";
    }

}

class Thor extends Movie{
    public Thor() {
        super("Thor");
    }

    public String plot(){
        return "The crown prince of Asgard, banished to Earth";
    }

}

class Hulk extends Movie{
    public Hulk() {
        super("Hulk");
    }

    public String plot(){
        return "Doctor turns in green coloured monster whenever he gets angry after a experiment";
    }

}

class CaptainAmerica extends Movie{
    public CaptainAmerica() {
        super("Captain America");
    }

    public String plot(){
        return "A patriotic supersoldier ";
    }

}

class BlackWidow extends Movie{
    public BlackWidow() {
        super("Black Widow");
    }

    // No plot here

}


public class Main {

    public static void main(String[] args) {
	    for(int i =1;i<11 ; i++){
	        Movie movie = randomMovie();
            System.out.println("Movie # " + i + " : " + movie.getName() + " \n " + " Plot : " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random()*5) +1;
        System.out.println("Random number generated : "+ randomNumber);
        switch (randomNumber){
            case 1:
                return new IronMan();
            case 2:
                return new Thor();
            case 3:
                return new Hulk();
            case 4:
                return new CaptainAmerica();
            case 5:
                return new BlackWidow();
        }
        return null;
    }
}
