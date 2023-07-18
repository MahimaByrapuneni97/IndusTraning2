package com.indus.pratice.basics;

public class Lock {
    private String fullName;
    private String emailId;

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String username) {
        this.fullName = username;
    }

    public static class Key {
        private String password;

        public void accessMembers(Lock lock) {
            lock.fullName = "username";
            this.password = "password";
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

	
}
