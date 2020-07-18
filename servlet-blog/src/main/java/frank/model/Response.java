package frank.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Response {
    private boolean success;
    private String message;
    private String stackTrace;
    private Object data;

    public boolean setSuccess(boolean b) {
        
    }

    public void setData(List<Article> articles) {
    }

    public void setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
    }

    public String getStackTrace() {
        return stackTrace;
    }
}
