public class Teacher
    {
        private string name;
        public Teacher(string name)
        {
            name = name;
        }
        public string Name
        {
            get { return name; }
            set { name = value; }
        }
    }