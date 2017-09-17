using System;
using System.Collections.Generic;

namespace OddFilter
{
    class Program
    {
        static void Main(string[] args)
        {
            // Create a function that takes a list as a parameter,
            // and returns a new list with every odd element from the orignal list
            Console.WriteLine(OddFilter(new List<int>  { 1, 2, 3, 4, 5 }));
            // should print [1, 3, 5]
        }
    }
}
