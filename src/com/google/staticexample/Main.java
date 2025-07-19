package com.google.staticexample;

public class Main{
    public static void main(String[] args) {
        Human chatgpt = new Human(10, "Chat GPT", 1_00_000, false);
        Human groq = new Human(4, "Groq", 3_00_000, false);
        Human claude = new Human(8, "Claude", 5_00_000, false);

        System.out.println(chatgpt.toString());
        System.out.println(groq.population);
        System.out.println(claude.population);
    }
}