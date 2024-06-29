class Solution(object):
    def discountPrices(self, sentence, discount):
        """
        :type sentence: str
        :type discount: int
        :rtype: str
        """
        ans=""
        for st in sentence.split(" "):
            if(st.startswith("$") and st[1:].isdigit()):
                num=float(st[1:])
                print(num)
                num=(100-discount)*num/100
                ans+="$"+"{:.2f}".format(num)
            else:
                ans+=st
            ans+=" "
        return ans.strip()

        