package org.example.two.collection;

import org.example.one.Gender;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonCsvReader {
    private String fileName;
    public PersonCsvReader(String fileName){
        this.fileName= fileName;
    }

    public List<Person>readPersonList(){
        List<Person> personList = new ArrayList<>();
        try (Scanner scanner= new Scanner(new File(fileName))) {
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            String[] lineFildes = line.split(",");
            Person person = new Person();
            person.setName(lineFildes[0]);
            person.setSurname(lineFildes[1]);
            String [] birthdayFields = lineFildes [2].split("-");
            int year= Integer.parseInt(birthdayFields[0]);
            int month = Integer.parseInt(birthdayFields[1]);
            int day = Integer.parseInt(birthdayFields[2]);

            LocalDate birthday= LocalDate.of(year,month,day);
            person.setBirthday(birthday);
            Gender spol= lineFildes[3].equals("M")?Gender.MALE:Gender.FEMALE ;
            person.setGender(spol);
            personList.add(person);
        }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }

        return personList;
    }



}




