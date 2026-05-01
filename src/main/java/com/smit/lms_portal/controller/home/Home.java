package com.smit.lms_portal.controller.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @GetMapping("/")
    public String home(){
        return """
                <!DOCTYPE html>
                               <html>
                               <head>
                                   <title>LMS Portal API</title>
                                   <meta name="viewport" content="width=device-width, initial-scale=1.0" />
                                   <style>
                                       body {
                                           font-family: Arial, sans-serif;
                                           background: linear-gradient(135deg, #0f172a, #020617);
                                           color: #e2e8f0;
                                           text-align: center;
                                           padding: 40px;
                                           margin: 0;
                                       }
                
                                       .container {
                                           max-width: 700px;
                                           margin: auto;
                                           background: #1e293b;
                                           padding: 40px;
                                           border-radius: 16px;
                                           box-shadow: 0 0 40px rgba(0,0,0,0.6);
                                           animation: fadeIn 1s ease-in-out;
                                       }
                
                                       h1 {
                                           color: #38bdf8;
                                           margin-bottom: 10px;
                                       }
                
                                       p {
                                           margin: 10px 0;
                                       }
                
                                       .status {
                                           color: #22c55e;
                                           font-weight: bold;
                                       }
                
                                       .endpoints {
                                           margin-top: 30px;
                                       }
                
                                       .endpoint {
                                           display: block;
                                           background: #0f172a;
                                           padding: 12px;
                                           margin: 10px 0;
                                           border-radius: 8px;
                                           text-decoration: none;
                                           color: #22c55e;
                                           transition: 0.3s;
                                           border: 1px solid transparent;
                                       }
                
                                       .endpoint:hover {
                                           background: #020617;
                                           border: 1px solid #38bdf8;
                                           transform: scale(1.03);
                                       }
                
                                       .footer {
                                           margin-top: 30px;
                                           font-size: 14px;
                                           color: #94a3b8;
                                       }
                
                                       .links a {
                                           margin: 0 10px;
                                           color: #38bdf8;
                                           text-decoration: none;
                                       }
                
                                       .links a:hover {
                                           text-decoration: underline;
                                       }
                
                                       .btn {
                                           margin-top: 20px;
                                           display: inline-block;
                                           padding: 10px 20px;
                                           border-radius: 8px;
                                           background: #38bdf8;
                                           color: black;
                                           text-decoration: none;
                                           font-weight: bold;
                                           transition: 0.3s;
                                       }
                
                                       .btn:hover {
                                           background: #0ea5e9;
                                       }
                
                                       @keyframes fadeIn {
                                           from { opacity: 0; transform: translateY(10px);}
                                           to { opacity: 1; transform: translateY(0);}
                                       }
                                   </style>
                               </head>
                               <body>
                
                               <div class="container">
                                   <h1>LMS Portal API</h1>
                                   <p class="status">Backend is LIVE and running successfully</p>
                
                                   <p>This is a production-style backend built using Java-Spring Boot.</p>
                
                                   <a class="btn" href="/swagger-ui/index.html">🔍 Open Swagger UI</a>
                
                                   <div class="endpoints">
                                       <h2>Available Endpoints</h2>
                
                                       <a class="endpoint" href="/student/">/student → Manage Students</a>
                                       <a class="endpoint" href="/course/">/course → Manage Courses</a>
                                       <a class="endpoint" href="/instructor/">/instructor → Manage Instructors</a>
                                       <a class="endpoint" href="/enrollment/">/enrollment → Manage Enrollments</a>
                                   </div>
                
                                   <div class="footer">
                                       <p>Spring Boot • PostgreSQL • Docker • Render</p>
                
                                       <p><strong>Smit Roy</strong></p>
                
                                       <div class="links">
                                           <a href="https://github.com/smitroy4" target="_blank">GitHub</a> |
                                           <a href="https://www.linkedin.com/in/smitroy22/" target="_blank">LinkedIn</a>
                                       </div>
                                   </div>
                               </div>
                
                               </body>
                               </html>
                """;
    }

}
