% 1)
find(Item,[Item|_]).
find(Item,[_|Tail]) :- find(Item,Tail).

% 2)
concatlist([],List,List).
concatlist([Head|Tail],List2,[Head|Result]) :- concatlist(Tail,List2,Result).

% 3)
% facts
item(pen,9.9).
item(ruler,3.9).
item(bag,58.9).
item(testpad,11.2).
% rule
findItem(Threshold) :- item(Name,Price), Price < Threshold, write(Name).

% 4)
% reverse built-in function
reverse_list(InputList, OutputList) :- rev(InputList,[],OutputList).
rev([],OutputList, OutputList).
rev([Head|Tail],List1,List2) :- rev(Tail,[Head|List1],List2).

% 5)
sumlst([],0).
sumlst([Head|Tail],Sum) :- sumlst(Tail,Total), Sum is Head + Total.
