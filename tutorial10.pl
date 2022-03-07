% facts
male(john).
male(fred).
male(harry).
female(mary).
female(julie).
female(susan).
female(anne).
blonde(john).
blonde(julie).
blonde(susan).
brunette(mary).
brunette(anne).
dark(fred).
dark(harry).
owns(fred,gold).
owns(julie,gold).

% rule
likes(john,Person) :- female(Person),blonde(Person),rich(Person).
likes(fred,Person) :- female(Person),brunette(Person).
likes(harry,Person) :- female(Person),rich(Person).
likes(mary,Person) :- male(Person),dark(Person).
likes(julie,Person) :- male(Person),dark(Person),rich(Person).
rich(Person) :- owns(Person,gold).