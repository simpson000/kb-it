package org.scoula.ex06.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface Command {
    String excute(HttpServletRequest request, HttpServletResponse response) throws IOException;
}
