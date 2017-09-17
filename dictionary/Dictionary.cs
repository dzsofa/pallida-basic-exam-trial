namespace Dictionary
{
    class Program
    {
        static Dictionary<string, string> dictionary;
        
        static void Main(string[] args)
        {
            dictionary = new Dictionary<string, string>;
            {
                { "alma", "apple" },
                { "fa", "tree" }
            };

            //add more words to your dictionary

        }


        // Implement this method. It should add the given key-value pair to the the dictionary
        public static void AddWord(string hunWord, string engWord)
        {

        }
        
        // Implement this method. It should remove the key-value pair by the given key from the dictionary
        public static void RemoveWord(string hunWord)
        {
        
        }

        //implement a method which works as a traslator from hungarian to english
        //example: you give it a parameter "alma" and it's output is "tree"
        public static string TranslateToEng(string hungarian) {

        }

        //implement a method which works as a translator from english to hungarian
        //example: you give it a parameter "apple" and it's output is "alma"
        public static string TranslateToHun(string english) {

        }
    }
}
