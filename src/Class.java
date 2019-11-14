public class Class {
    private long id;
    private String name;
    private String description;
    private long studentId;
    private long facultyId;

    public Class() {
    }

    public Class(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Class(long studentId) {
        this.studentId = studentId;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public long getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(long facultyId) {
        this.facultyId = facultyId;
    }
}

