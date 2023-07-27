package uagc.LawBuddy.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.Button
import android.widget.Toast
import uagc.LawBuddy.R

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val button1: Button = view.findViewById(R.id.button1)
        val button2: Button = view.findViewById(R.id.button2)
        val button3: Button = view.findViewById(R.id.button3)
        val button4: Button = view.findViewById(R.id.button4)
        val button5: Button = view.findViewById(R.id.button5)
        val button6: Button = view.findViewById(R.id.button6)
        val button7: Button = view.findViewById(R.id.button7)
        val button8: Button = view.findViewById(R.id.button8)
        val button9: Button = view.findViewById(R.id.button9)
        val button10: Button = view.findViewById(R.id.button10)
        val button11: Button = view.findViewById(R.id.button11)
        val button12: Button = view.findViewById(R.id.button12)



        // Set click listeners for the buttons
        button1.setOnClickListener {
            showToast("Button 1 clicked!")
        }

        button1.setOnClickListener {
            showToast("Bankruptcy clicked!")
        }

        button2.setOnClickListener {
            showToast("Business clicked!")
        }

        button3.setOnClickListener {
            showToast("Constitutional clicked!")
        }

        button4.setOnClickListener {
            showToast("Criminal Defense clicked!")
        }

        button5.setOnClickListener {
            showToast("Employment and Labor clicked!")
        }

        button6.setOnClickListener {
            showToast("Entertainment clicked!")
        }

        button7.setOnClickListener {
            showToast("Estate Planning clicked!")
        }

        button8.setOnClickListener {
            showToast("Family clicked!")
        }

        button9.setOnClickListener {
            showToast("Immigration clicked!")
        }

        button10.setOnClickListener {
            showToast("Intellectual clicked!")
        }

        button11.setOnClickListener {
            showToast("Personal Injury clicked!")
        }

        button12.setOnClickListener {
            showToast("Tax clicked!")
        }

    }

    private fun showToast(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
    }
}
