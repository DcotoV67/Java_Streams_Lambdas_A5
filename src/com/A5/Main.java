package com.A5;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
	// write your code here

        Streams streams = new Streams();

        List<Peliculas> films = streams.getPeliculas();

        Menu menu = new Menu();

        menu.mostrarMenu(films);


    }
}
