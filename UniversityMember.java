
class UniversityMember {
    int memberId;

    void checkIn() {
        System.out.println("Member checked in");
    }
}

class Staff extends UniversityMember {
    String department;

    void attendMeeting() {
        System.out.println("Department: " + department);
        System.out.println("Staff is attending a meeting");
    }
}

class Professor extends Staff {
    String subject;

    void conductLecture() {
        System.out.println("Subject: " + subject);
        System.out.println("Professor is conducting a lecture");
    }
}

class AdminOfficer extends Staff {
    String officeRoom;

    void processFiles() {
        System.out.println("Office Room: " + officeRoom);
        System.out.println("Admin officer is processing files");
    }
}

class UniversityMain {
    public static void main(String[] args) {
        Professor p = new Professor();
        p.memberId = 101;
        p.department = "CSE";
        p.subject = "Java";

        p.checkIn();
        p.attendMeeting();
        p.conductLecture();

        System.out.println();

        AdminOfficer a = new AdminOfficer();
        a.memberId = 102;
        a.department = "Administration";
        a.officeRoom = "Room 10";

        a.checkIn();
        a.attendMeeting();
        a.processFiles();
    }
}
