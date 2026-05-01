package com.smit.lms_portal.controller.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @GetMapping("/")
    public String home(){
        return """
                <html>
                <head>
                    <title>LMS Portal API</title>
                    <style>
                        body {
                            font-family: Arial;
                            background: #0f172a;
                            color: white;
                            text-align: center;
                            padding: 50px;
                        }
                        h1 {
                            color: #38bdf8;
                        }
                        a {
                            color: #22c55e;
                            display: block;
                            margin: 10px;
                            font-size: 18px;
                            text-decoration: none;
                        }
                    </style>
                </head>
                <body>
                    <h1>LMS Portal API</h1>
                    <p>Backend is running successfully</p>

                    <h2>Available Endpoints:</h2>

                    <a href="/student/">Students</a>
                    <a href="/course/">Courses</a>
                    <a href="/instructor/">Instructors</a>
                    <a href="/enrollment/">Enrollments</a>

                    <p style="margin-top:30px;">Built with Spring Boot + PostgreSQL + Docker</p>
                </body>
                </html>
                """;
    }

}
