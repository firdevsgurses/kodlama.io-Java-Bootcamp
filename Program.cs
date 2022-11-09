using System;

namespace YouTube_CS_Java
{
    class Program
    {
        static void Main(string[] args)
        {

            //------------------------------------------------------------------------

            //  CreditManager creditManager = new CreditManager();
            //  creditManager.Calculate();
            //  creditManager.Save();

            //  Customer customer = new Customer(); //ornek olusturmak, instance creation
            //                                      //heap'te referans numarasını olusturmak
            //  customer.Id = 1;
            //  customer.City = "Ankara";

            //  Company company = new Company();
            //  company.TaxNumber = "1000000000";
            //  company.CompanyName = "Arcelik";
            //  company.Id = 100;

            ////  CustomerManager customerManager1 = new CustomerManager(new Company());
            //  CustomerManager customerManager2 = new CustomerManager(new Person());

            //  Person person = new Person();
            //  person.FirstName = "Firdevs";
            //  person.LastName = "Gurses";
            //  person.Nationalıdentity = "1234567899";

            //  CustomerManager customerManager = new CustomerManager(person);
            //  customerManager.Save();
            //  customerManager.Delete();


            //  Customer c1 = new Customer();
            //  Customer c2 = new Person();
            //  Customer c3 = new Company();

            //------------------------------------------------------------------------
            CustomerManager customerManager = new CustomerManager(new Customer(), new MiliataryCreditMAnager());
            customerManager.GiveCredit();
            CustomerManager customerManager1 = new CustomerManager(new Customer(), new TeacherCreditManager());
            customerManager1.GiveCredit();

            Console.ReadLine();
        }
    }
    class CreditManager
    {
        public void Calculate(int creditType)
        {

            Console.WriteLine("calculated");
        }
        public void Save()
        {
            Console.WriteLine("credit given");
        }
    }
    interface ICreditManager
    {
        void Calculate();
        void Save();
    }
    abstract class BaseCreditManager : ICreditManager
    {
        public abstract void Calculate();
        public virtual void Save()
        {
            Console.WriteLine("Credit has been saved. ");
        }
    }
    class TeacherCreditManager : BaseCreditManager, ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("Teacher credit has been calculated. ");
        }
        public override void Save()
        {
            //
            base.Save();
            //
        }
    }
    class MiliataryCreditMAnager : BaseCreditManager, ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("Soldier credit has been calculated. ");
        }
    }
    //Solid -> class sadece ozellik tutar operasyon yapmıyoruz, yapacaksak
    //baska classta
    class Customer
    {
        public Customer()//musteri nesnesini baslatacak kod
        {
            //nesneyi her newledigimizde calısır
            Console.WriteLine("customer object has been started!");
        }
        public int Id { get; set; }
        public string City { get; set; }

    }
    class Person : Customer
    {
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public string Nationalıdentity { get; set; }
    }
    class Company : Customer //inheritance
    {
        public string CompanyName { get; set; }
        public string TaxNumber { get; set; }
    }
    //katmanlı mimari
    class CustomerManager
    {
        private Customer _customer;
        private ICreditManager _creditManager;
        public CustomerManager(Customer customer, ICreditManager creditManager)//constructor olusturduk
        {
            _customer = customer;
            _creditManager = creditManager;
        }
        public void Save()
        {
            Console.WriteLine("customer has been saved: ");
        }
        public void Delete()
        {
            Console.WriteLine("customer has been deleted: ");
        }
        public void GiveCredit()
        {
            _creditManager.Calculate();
            Console.WriteLine("Credit given "); 
        }
    }
}
