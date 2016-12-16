package servlets;

import logicForFolderStructure.Filler;
import logicForFolderStructure.FoldersAndFilesdata;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/")
public class FolderStructure extends HttpServlet {
    Filler folderStructure = new Filler();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<FoldersAndFilesdata> filesAndFolders = folderStructure.getListFilesAndFolders("/home/andriis");

        request.setAttribute("datas", filesAndFolders);
        request.getRequestDispatcher("home.jsp").forward(request, response);

    }
}

