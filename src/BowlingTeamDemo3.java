import java.util.Scanner;

public class BowlingTeamDemo3
{
    public static void main(String [] args)
    {
        // declaration

        String name;
        final int NUM_TEAMS = 4;
        BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];
        int x;
        int y;
        final int NUM_TEAM_MEMBERS = 4;

        Scanner input = new Scanner(System.in);

        //for loop to Enter team name
        for ( y = 0; y < NUM_TEAMS; y++)
        {
            teams[y] = new BowlingTeam();
            System.out.print("Enter team name >> ");
            name = input.nextLine();
            teams[y].setTeamName(name);
        }

        // for loop to Enter team members name
        for (int w = 0; w < NUM_TEAM_MEMBERS; ++w)
        {
            teams[w] = new BowlingTeam();
            System.out.println("Enter Team Members Name >> " );
            name = input.nextLine();
            teams[w].setMembers(w,name);
        }


        // Display the output

        for (int i = 0; i < NUM_TEAMS; ++i)
        {
            System.out.println("\nMembers of team " + teams[i] .getTeamName());
            for (x = 0; x < NUM_TEAM_MEMBERS;++x)
                System.out.print(teams[y].getMember(x) + " ");
            System.out.println();
        }

        System.out.println("Enter a team name to see its roster >> ");
        name = input.nextLine();

        for ( y = 0; y < teams.length; ++y)
        {
            if(name.equals(teams[y].getTeamName()) )
                for ( x = 0; x < NUM_TEAM_MEMBERS; ++x)
                {
                    System.out.print(teams[y].getMember(x) + " ");
                }
        }
    }
}
