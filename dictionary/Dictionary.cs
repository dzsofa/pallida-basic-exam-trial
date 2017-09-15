namespace Dictionary
{
    class Program
    {
        static void Main(string[] args)
        {
            Dictionary<string, string> dictionary = new Dictionary<string, string>
            {
                { "alma", "apple" },
                { "fa", "tree" }
            };

            //add more words to your dictionary

        }
        //implement a method which works as a traslator from hungarian to english
        //example: you give it a parameter "alma" and it's output is "tree"

        //implement a method which works as a translator from english to hungarian
        //example: you give it a parameter "apple" and it's output is "alma"
    }
}
