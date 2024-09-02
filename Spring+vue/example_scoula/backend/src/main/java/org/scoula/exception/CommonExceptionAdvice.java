package org.scoula.exception;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.scoula.member.exception.PasswordMissmatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice // 컨트롤러(경로)에서 예외가 발생하면 여기서 받겠다
@Log4j
public class CommonExceptionAdvice { // 사실상 컨트롤러

    @ExceptionHandler(NoHandlerFoundException.class)
    public String handle404(NoHandlerFoundException ex) {
        log.error(ex);
        return "/resources/index.html";
    }
    @ExceptionHandler(PasswordMissmatchException.class)
    public ResponseEntity<?> handlePasswordError(Exception ex) {
        return ResponseEntity.status(400)
                .header(HttpHeaders.CONTENT_TYPE, "application/json; charset=utf-8")
                .body(ex.getMessage());
    }
//    // catch할 예외 제시 -> 여기서는 모든 예외(500)
//    @ExceptionHandler(Exception.class)
//    public String expect(Exception ex, Model model) { // 컨트롤러이기 때문에 return값 동일 == view 이름
//        log.error("Exception", ex);
//        model.addAttribute("exception", ex);
//        log.error(model);
//        return "error_page";
//    }
//
//    @ResponseStatus(HttpStatus.NOT_FOUND) // 404 에러 처리
//    public String handl404(NoHandlerFoundException ex){
//        return "custom404";
//    }

}
