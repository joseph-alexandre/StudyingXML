package br.com.joseph;

import br.com.joseph.Model.Person;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Main {

    public static void main(String[] args) {

//      Cria um objeto Person
        Person person = new Person("Joseph", "xxx.xxx.xxx-xx", 19);
//      Cria um objeto XStream. Esse parâmetro é utilizado
        XStream xStream = new XStream(new DomDriver());

        System.out.println(xStream.toXML(person));
    }
}
