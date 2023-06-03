package com.fisttech.finhist.model.restest;

public class Randuser {

    private Long id; // 3260,
            private String uid; // TODO: try UUID ": "cd0fca69-adbc-425d-830b-a71e828d5dc5",
            private String password; // ": "JTCv6XGExl",
    private String first_name;//": "Karan",
    private String last_name; //": "Sporer",
    private String username; //": "karan.sporer",
    private String   email;   //"karan.sporer@email.com",
    private String  avatar; //": "https://robohash.org/repudiandaeiddolores.png?size=300x300&set=set1",
    private String   gender; //: "Non-binary",
    private String   phone_number; //": "+7-6 400-439-7396 x476",
    private String  social_insurance_number; //": "336634662",
    private String    date_of_birth; // TODO: DAtetime, ?": "1990-09-26",

    public Randuser() {
    }

    public Randuser(Long id, String uid, String password, String first_name, String last_name, String username, String email, String avatar, String gender, String phone_number, String social_insurance_number, String date_of_birth) {
        this.id = id;
        this.uid = uid;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.email = email;
        this.avatar = avatar;
        this.gender = gender;
        this.phone_number = phone_number;
        this.social_insurance_number = social_insurance_number;
        this.date_of_birth = date_of_birth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getSocial_insurance_number() {
        return social_insurance_number;
    }

    public void setSocial_insurance_number(String social_insurance_number) {
        this.social_insurance_number = social_insurance_number;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public class Employment {
        private String title;
        private String keySkill;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getKeySkill() {
            return keySkill;
        }

        public void setKeySkill(String keySkill) {
            this.keySkill = keySkill;
        }

        public Employment() {
        }

        public Employment(String title, String keySkill) {
            this.title = title;
            this.keySkill = keySkill;
        }
    }
//            "employment": {
//        "title": "District Education Specialist",
//                "key_skill": "Networking skills"
//    },
//        "address": {
//        "city": "West Nickieview",
//                "street_name": "Reyes Inlet",
//                "street_address": "8988 Haley Passage",
//                "zip_code": "19051-0093",
//                "state": "Ohio",
//                "country": "United States",
//                "coordinates": {
//            "lat": 31.976775485053977,
//                    "lng": -143.7585361945794
//        }
//    },
//        "credit_card": {
//        "cc_number": "6771-8918-8628-3841"
//    },
//        "subscription": {
//        "plan": "Essential",
//                "status": "Pending",
//                "payment_method": "Money transfer",
//                "term": "Monthly"
//    }
//    }


}
