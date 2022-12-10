# Bug-Tracking-System
--------------------------------------------------------------------------------------------------------------
Bug Tracking System that can be used in organizations to increase the productivity of the team by making the communication between them easier.

It is made using Database, the database used in it is Microsoft SQL Server 

How does it work?

This System Contains 4 Modules:

        1- Admin Module

        2- Project Manager Module

        3- Tester Module

        4- Developer Module

Each Module is limited to the permitted operations for their role.

------------------

Admin:-
------------------
        - Admin can add new member, with different roles (admin,pm,developer,tester), to the system.

        - Admin can update data of existing members with different roles (admin,pm,developer,tester).

        - Admin can delete members, with different roles (admin,pm,developer,tester), from the system.

        - Admin can view all bugs from all projects.
        
        - Admin can view all users in the system.
-----------------
Project Manager (PM):-
--------------
        - PM can view all bugs from all projects.
        
        - PM can view Developers performance.
        
        - PM can view Testers performance.
        
        - PM can edit the status of the bug either closed or opened 
-----------------
Tester:-
--------------
        - Tester can view all bugs from all projects.
        
        - Tester can define a bug and assign it to a specific developer. Bug has the following attributes (Bug ID, Bug Name, priority, Bug Type, Bug Level, Date Discovered, Project In Wehre the Bug is Found, Assigned Developer's ID, Tester's ID, Screenshot for the Bug)
        
        - Tester can edit the status of the bug either closed or opened 
-----------------
Developer:-
--------------
        - Developer can view all bugs assigned to him/her.
        
        - Developer can edit the status of the bug either closed or opened 


