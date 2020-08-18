This is Java SPring MVC basic Implementation.

where we create a dispatcher and it will send the request to controller class.
Controller class will check the mapping.
when it matches
then controller will return the view
the viewResolver will append the return view as a prefix
and finally it will add the suffix .jsp to it.

this is how controller will return a view and viewResolver will map it to view
and which is finally rendered to user on the screen.