import java.util.Scanner;

public class BowlingTeamDemo
{
    public static void main(String [] args)
    {
        String name;
        BowlingTeam bowlTeam = new BowlingTeam();
        int x;
        final int NUM_TEAM_MEMBERS = 4;

        Scanner input = new Scanner(System.in);

        // Enter team name and assign to Team Name object
        System.out.print("Enter team name >> ");
        name = input.nextLine();
        bowlTeam.setTeamName(name);

        // for loop to enter team members name
        for (int y = 0; y < NUM_TEAM_MEMBERS; ++y)
        {
            System.out.println("Members of team " );
            name = input.nextLine();
            bowlTeam.setMembers(y, name);
        }

        // Display the output

        System.out.println("Members of team " + bowlTeam.getTeamName());
        for (int i = 0; i < NUM_TEAM_MEMBERS; ++i)
        {
            System.out.print(bowlTeam.getMember(i) + " ");
            System.out.println();
        }


    }
}
