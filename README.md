# 7
We need to avoid public access from other students, so I changed the name of the repository<br/>
If any of you has an upgraded account, he can make this repo private, which is better<br/>
<br/>
!IMPORTANT!<br/>
-Master = production only code<br/>
-students can get private repo https://github.com/edu<br/>
-very very short notes on version control from slides are listed below<br/>
<br/>
useful links:<br/>
-Gitgui under linux.<br/>
Simple, not linked to IDE. 2009 tutorial http://nathanj.github.io/gitguide/tour.html<br/>
-Git in eclipse: http://www.vogella.com/tutorials/EclipseGit/article.html<br/>
Under section 25, links to simpler tutorials on git<br/>
-Simple online tutorial: https://try.github.io/<br/>
-Cheatsheet: https://education.github.com/git-cheat-sheet-education.pdf<br/>
-Github help for students: https://education.github.com/<br/>
<br/>
<br/>
<br/>
notes on version control from slides:<br/>
<br/>
add tag (When? After each iteration or at the end of stage 1? Let's decide before coding)<br/>
<br/>
work flow: <br/>
1)chek out files<br/>
2)work on them<br/>
3)commit to their own repository<br/>
Files can also be pushed/pulled to/from other repositories<br/>
<br/>
-A repository is a collection of branches<br/>
Contains: history, versioning over time, different branches and tags.<br/>
-A branch is an active line of development<br/>
One or more branches in each repository. "git checkout" between them.<br/>
-A commit is a single point of history<br/>
The entire history of project is a set of interrelated commits<br/>
<br/>
-Checkout is changing the working tree (switching branches)<br/>
-HEAD is a reference to the tip of the current branch.<br/>
-Tags permanently mark important points in your project history. Generally used to mark release points (e.g. "v1.3")<br/>
<br/>
Git supports branching<br/>
-Make a new branch, try out a new feature without affecting ‘master’ code<br/>
-Later, merge in the new feature, OR, abandon it! (might need to solve conflicts)<br/>
