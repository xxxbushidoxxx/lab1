package com.example.lab1

import jakarta.servlet.annotation.WebServlet
import jakarta.servlet.http.HttpServlet
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import java.io.File
import java.io.FileWriter

@WebServlet(name = MyServlet , value = ["/hello"])
class MyServlet : HttpServlet() {
    override fun doPost(req: HttpServletRequest, resp: HttpServletResponse) {
        val key = req.getParameter("key")
        val value = req.getParameter("value")?.toInt() ?: 0
        val test = req.getParameter("test")?.toBoolean() ?: false

        if (test) {
            resp.writer.write("Confirmation message")
        } else {
            val file = File("database.txt")
            val writer = FileWriter(file, true)
            for (i in 0 until value) {
                writer.write("$key\n")
            }
            writer.close()

            resp.writer.write("<html><body>")
            file.forEachLine {
                resp.writer.write("<p>$it</p>")
            }
            resp.writer.write("</body></html>")
        }
    }

    override fun destroy() {

    }
}