/**
 * Created by Pdante on 2015-03-14.
 */
public class Problem {
    private String userName;
    private String building;
    private String roomNumber;
    private String errorType;
    private String notes;

    public Problem() {
    }



    public Problem(String userName, String building, String roomNumber, String errorType, String notes) {
        this.userName = userName;
        this.building = building;
        this.roomNumber = roomNumber;
        this.errorType = errorType;
        this.notes = notes;
    }

        @Override
        public String toString(){

             return "Problem [user" + userName + ", building" + building + ", " +
                    "room number" + roomNumber + ", error type" + errorType + " notes: " + notes + "]";
        }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getBuilding() {
        return building;
    }
    public void setBuilding(String building){
        this.building = building;
    }
    public String getRoomNumber(){
        return roomNumber;
    }
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
    public String getErrorType() {
        return errorType;
    }
    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}