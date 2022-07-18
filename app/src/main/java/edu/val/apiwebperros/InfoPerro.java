package edu.val.apiwebperros;

public class InfoPerro {

    /**
     * {
     *     "message": "https://images.dog.ceo/breeds/puggle/IMG_124524.jpg",
     *     "status": "success"
     * }
     */

    private String message;
    private String status;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public InfoPerro(String message, String status) {
        this.message = message;
        this.status = status;
    }

    public InfoPerro() {

    }

    @Override
    public String toString() {
        return "InfoPerro{" +
                "message='" + message + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
