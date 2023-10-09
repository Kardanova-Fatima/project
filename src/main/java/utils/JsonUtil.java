package utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import models.Student;
import models.University;

import java.util.List;

public class JsonUtil {
    private JsonUtil(){

    }
    public static String studentToJson(Student student){
        return new GsonBuilder().setPrettyPrinting().create().toJson(student);
    }
    public static String universityToJson(University university){
        return new GsonBuilder().setPrettyPrinting().create().toJson(university);
    }
    public static Student jsonStudent(String json){
        return new Gson().fromJson(json, Student.class);
    }
    public static University jsonUniversity(String json){
        return new Gson().fromJson(json, University.class);
    }
    public static String studentListJson(List<Student> students){
        return new GsonBuilder().setPrettyPrinting().create().toJson(students);
    }
    public static String universityListToJson(List<University> universities){
        return new GsonBuilder().setPrettyPrinting().create().toJson(universities);
    }
    public static List<Student> jsonStudentList(String json){
        return new Gson().fromJson(json, new TypeToken<List<Student>>() {}.getType());
    }
    public static List<University> jsonUniversityList(String json){
        return new Gson().fromJson(json, new TypeToken<List<University>>() {}.getType());
    }
}
