#include <bits/stdc++.h>
using namespace std;

class Animal
{
    int password = 123245367;

public:
    int numberOfLegs;
    virtual void speak()
    {
        cout << "Animal is speaking\n";
    }
    // expose private vars
    friend void getPassword(Animal *);
};

class Dog : public Animal
{
public:
    int teeth;
    void speak() override
    {
        cout << "Dog is barking\n";
    }
};

void getPassword(Animal *a)
{
    cout << a->password << "\n";
}

int main()
{
    // new thing always returns a pointer to that object
    Animal *a = new Animal();
    a->speak();
    // a->password;
    getPassword(a);

    Dog *d = new Dog();
    d->speak();

    // reference: stack ma store thase
    // new Dog(): object -> Heap
    // heap random memory dump

    // parent => (what variables/methods can be accessed )
    // child  => (which one to access)
    Animal *parent = new Dog();
    parent->speak();

    // Dog *dog2 = new Parent();
    // Parent class can never derive variables/ methods from child class
}