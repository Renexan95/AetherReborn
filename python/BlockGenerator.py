import argparse
import sys
import traceback
from typing import Sequence

from mcresources import ResourceManager, utils
from mcresources.type_definitions import Json
rm = ResourceManager

def main(BlockName, ModID):
     
    if BlockName == "":
        print("Invalid Block Name")
    elif ModID == "":
        print("Invalid ModID")
    else:
        #Take the ModID and insert for registry
            
        #Take the Block name and convert for the following block
        BlockNameLowercase = BlockName.lower()
        print("Block Name lowered")
        ## Block-state generator
        # Plank

        # Log

        # Wood

        # Stripped Log

        # Stripped Wood

        # Fence

        # Gate

        # Button
            
        # Pressure plate

        rm.item_tag()
        print("JSon Flushed")

print("Enter Block Name")
BlockName = input()
print("Enter ModID Name")
ModID = input()
if __name__ == '__main__':
    main(BlockName, ModID)