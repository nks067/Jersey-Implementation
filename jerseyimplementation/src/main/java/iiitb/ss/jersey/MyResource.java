package iiitb.ss.jersey;

import iiitb.ss.jersey.dao.StudentDAO;
import iiitb.ss.jersey.data.Student;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/api")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET  @Path("/")
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "working...";
    }

    @GET @Path("/getAll")
    @Produces({"application/json", "application/xml"})
    public List<Student> FindEmployee() {
        StudentDAO stDAO=new StudentDAO();
        return stDAO.dataList;
    }



    @GET @Path("/add")
    //@Produces({"application/json", "application/xml"})
    @Produces(MediaType.TEXT_PLAIN)
    public String addStudent(
            @QueryParam("name") String name,
            @QueryParam("roll") long roll,
            @QueryParam("marks") double marks,
            @QueryParam("course") String course){
            Student obj=new Student(name,roll,course,marks);
        StudentDAO stDAO=new StudentDAO();
        stDAO.dataList.add(obj);
        return "success";

    }
    @POST
    @Path("/addStudent")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String addStudentPost(Student student) {
        String result = "Data saved : " + student;
        System.out.println(result);
        StudentDAO stDAO=new StudentDAO();
        stDAO.dataList.add(student);
        return result;
    }
}
